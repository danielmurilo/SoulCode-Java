public class EstudandoEnums {

    public static void main(String[] args) {
        enum DiasDaSemana {
            DOMINGO,
            SEGUNDA_FEIRA,
            TERÇA_FEIRA,
            QUARTA_FEIRA,
            QUINTA_FEIRA,
            SEXTA_FEIRA,
            SABADO
        }
        DiasDaSemana hoje = DiasDaSemana.QUINTA_FEIRA;
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR}

        NivelDev nivel = NivelDev.SENIOR;
        NivelDev nivel2 = NivelDev.valueOf("JUNIOR");

        switch(nivel) {
            case JUNIOR:
                System.out.println("Seu nível é JUNIOR");
                break;
            case PLENO:
                System.out.println("Seu nível é PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nível é SENIOR");
                break;
        }

        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
