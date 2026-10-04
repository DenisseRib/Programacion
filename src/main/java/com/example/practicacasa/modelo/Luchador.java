package com.example.practicacasa.modelo;

public class Luchador {

        private String nombre;
        private int ataque;
        private int vida;
        private int vidaMaxima; // Útil si quieres calcular porcentajes de vida exactos

        // Constructor vacío (requerido en muchos frameworks)
        public Luchador() {
        }

        // Constructor parametrizado
        public Luchador(String nombre, int ataque, int vida) {
            this.nombre = nombre;
            this.ataque = ataque;
            this.vida = vida;
            this.vidaMaxima = vida;
        }

        // --- Métodos de lógica de negocio (Comportamiento) ---

        /**
         * Aplica el daño recibido y evita que la vida baje de 0.
         */
        public void recibirDanio(int cantidad) {
            this.vida -= cantidad;
            if (this.vida < 0) {
                this.vida = 0;
            }
        }

        /**
         * Comprueba si el luchador sigue con vida.
         */
        public boolean estaVivo() {
            return this.vida > 0;
        }

        // --- Getters y Setters ---

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getAtaque() {
            return ataque;
        }

        public void setAtaque(int ataque) {
            this.ataque = ataque;
        }

        public int getVida() {
            return vida;
        }

        public void setVida(int vida) {
            this.vida = vida;
        }

        public int getVidaMaxima() {
            return vidaMaxima;
        }

        public void setVidaMaxima(int vidaMaxima) {
            this.vidaMaxima = vidaMaxima;
        }

}
