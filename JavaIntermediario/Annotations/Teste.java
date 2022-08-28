package JavaIntermediario.Annotations;

    @InformacaoAula(
            autor = "Henrique",
            aulaNumero = 10,
            blog = "google.com"
    )
    public class Teste {

        @InformacaoAula(
                autor = "Henrique",
                aulaNumero = 10,
                blog = "google.com"
        )
        public static void main(String[] args) {}
}
