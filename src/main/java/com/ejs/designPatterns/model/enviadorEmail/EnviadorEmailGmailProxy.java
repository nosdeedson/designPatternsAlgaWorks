package com.ejs.designPatterns.model.enviadorEmail;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class EnviadorEmailGmailProxy {

    public  void conferirEmails(List<String> emails) throws FileNotFoundException {
        File file = new File(this.getClass().getClassLoader().getResource("listaNegra.xml").getFile());
        InputStream inputStream = new FileInputStream(file);
        XStream xStream = new XStream();
        xStream.addPermission(NoTypePermission.NONE);
        xStream.addPermission(NullPermission.NULL);
        xStream.addPermission(PrimitiveTypePermission.PRIMITIVES);
        xStream.allowTypes(new Class[] {Email.class, List.class});
        xStream.alias("emails", List.class);
        xStream.alias("email", Email.class);

        List<Email> blackList = (List<Email>) xStream.fromXML(inputStream);
        List<String> tirarEmails = new ArrayList<>();
        blackList.forEach(e -> tirarEmails.add(e.getEmail()));
        emails.removeAll(tirarEmails);
        EnviadorEmailGmail enviadorEmailGmail = new EnviadorEmailGmail();
        for(String email: emails ){
            enviadorEmailGmail.enviar(email);
        }

    }

}
