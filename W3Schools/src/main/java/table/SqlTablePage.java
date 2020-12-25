package table;

import Base.CommonApi;

public class SqlTablePage extends CommonApi {

    public void readTableData() {
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(3) td:nth-child(3) ");
        System.out.println(tableData);


    }



}
