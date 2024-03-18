package Structural.Adapter;

import javax.xml.crypto.dsig.XMLObject;

public class FancyUIServiceAdapter implements IMultiRestoApp{

    private FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        this.fancyUIService = new FancyUIService();
    }
    @Override
    public void displayMenus(String xmlData) {
        // 1) Convert xmlData to JsonData
        String jsonData = convertXmlToJson(xmlData);
        // 2) Call fancyUIService.displayMenus(JsonData)
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommandations(String xmlData) {
        // 1) Convert xmlData to JsonData
        String jsonData = convertXmlToJson(xmlData);
        // 2) Call fancyUIService.displayMenus(JsonData)
        fancyUIService.displayRecommandations(jsonData);
    }

    public String convertXmlToJson(String xmlData) {
        // Convert xmlData to JsonData
        return xmlData;
    }
}
