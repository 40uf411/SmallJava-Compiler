public class QuadGenerator extends SjBaseVisitor<Integer> {

    private Quads quads = new Quads();

    private void showText(String text, int typeOfText)
    {
        TextDisplayer.getInstance().showText(text,typeOfText,TextDisplayer.QUADGEN);
    }

    @Override
    public Integer visitStart(SjParser.StartContext ctx) {

        quads.addQuad("END","","","");
        showText("generated quads: ",TextDisplayer.COMPILERTEXTS);
        showText("******************************************************",TextDisplayer.COMPILERTEXTS);
        for (int i = 0; i < quads.size(); i++) {
            showText(i + ": " + quads.getQuad(i).toString(),TextDisplayer.COMPILERTEXTS);
        }
        showText("******************************************************",TextDisplayer.COMPILERTEXTS);

        return visitChildren(ctx);
    }
}
