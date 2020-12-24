/*package Lab3;

import java.io.File;

public class XMLService {

    /**
     * метод saveBankData сохраняет объект типа Bank в XML документ
     */
  /*  public static void saveBankData(MTS mts) {

        try {
            JAXBContext context = JAXBContext.newInstance(MTS.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(mts, new File("mts.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    /**
     * Метод loadBankFromXML преобразует XML документ в объект типа Bank
     */
 /*   public static MTS loadMTSFromXML() {

        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(MTS.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (MTS) un.unmarshal(new File("mts.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
*/