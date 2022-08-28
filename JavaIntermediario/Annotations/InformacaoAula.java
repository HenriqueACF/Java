package JavaIntermediario.Annotations;

public @interface InformacaoAula {
    String autor();

    int aulaNumero();

    String blog() default "http://google.com";

    String site() default "http://google.com.br";
}
