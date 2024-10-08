package constants;
//アプリケーションスコープのパラメータ名を定義するファイル
public enum PropertyConst {

    //ペッパー文字列
    PEPPER("pepper");

    private final String text;
    private PropertyConst(final String text) {
        this.text = text;
    }

    public String getValue() {
        return this.text;
    }
}
