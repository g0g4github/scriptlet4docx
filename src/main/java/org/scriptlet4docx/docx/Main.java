package org.scriptlet4docx.docx;

import java.io.File;
import java.util.HashMap;

/**
 * Created by Chaschin on 09.02.2017.
 */
public class Main {

    static HashMap<String, Object> params = new HashMap<String, Object>();

    static {
        params.put("value", 1);
    }
    public static void main(String[] args) throws Exception {
      //  String template = TestUtils.readResource("/docx/DocxTemplate.xml");
        File inFile = new File("src/_test/DocxTemplaterTest-1.docx");
        File resFile = new File("src/_test/DocxTemplaterTest-1-file-result-1.docx");
        resFile.delete();

        DocxTemplater docxTemplater = new DocxTemplater(inFile);
        docxTemplater.processCleanedTemplate(template, params);

    }
}
