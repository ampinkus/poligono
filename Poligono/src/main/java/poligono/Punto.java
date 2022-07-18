package poligono;
    public class Punto {
        // Creo una clase Punto donde cada punto se representa como un par de coordenadas (x,y)

        // atributos:
        private Double X;  // coordenada x del punto
        private Double Y; // coordenada y del punto

        // constructores
        /**
         * constructor para un punto de coordenadas dadas
         *
         * @param X coordenada x del punto
         * @param Y coordenada y del punto
         */
        public Punto(Double X, Double Y) {
            this.X = X;
            this.Y = Y;
        }

        // getters
        /**
         * @return coordenada x del punto
         */
        public Double getX() {
            return X;
        }
        /**
         * @return coordenada y del punto
         */
        public Double getY() {
            return Y;
        }

        // setters
        /**
         * @param X Para modificar el valor de la coordenada x del punto
         */
        public void setX(Double X) {
            this.X = X;
        }
        /**
         * @param Y Para modificar el valor de la coordenada y del punto
         */
        public void setY(Double Y) {
            this.Y = Y;
        }

    }

