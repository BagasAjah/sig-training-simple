package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    public void buildAndSendMail(Mail mail, Person person,  EmailContent emailContent) {
        String mId = person.getFirstName().charAt(0) + "." + person.getLastName().substring(0, 7) + "@"
            + person.getDivision().substring(0, 5) + ".compa.ny";
        MailMessage mMessage = formatMessage(mail.getMailFont(),
            emailContent.getMessage1() + emailContent.getMessage2()+ emailContent.getMessage3());
        mail.getMailMan().send(mId, emailContent.getSubject(), mMessage);
    }
    
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

}