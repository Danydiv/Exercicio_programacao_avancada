package Questao3;

public class terrestre  extends meioDeTransporte {
        private int qtdeRoda;
        private Double pontencia;

        public terrestre(int id, short ano, String modelo, Double cargaMaxima, int qtdeRoda, Double pontencia) {
            super(id, ano, modelo, cargaMaxima);
            this.qtdeRoda = qtdeRoda;
            this.pontencia = pontencia;
        }


        public int getQtdeRoda() {
            return qtdeRoda;
        }


        public void setQtdeRoda(int qtdeRoda) {
            this.qtdeRoda = qtdeRoda;
        }


        public Double getPontencia() {
            return pontencia;
        }


        public void setPontencia(Double pontencia) {
            this.pontencia = pontencia;
        }
        public Double consumo() {
            double c = this.pontencia * (this.getCargaMaxima() * 100);
            return c;
        }


}


