 static void imprimirSelecionados(){
        String [] candidatos = {"JOAO", "MARCIA", "DORIA", "JOHN", "MARIA"};
        
        System.out.println("Imprimindo a lista informando o indice do elemento");
        
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação");
        
        for(String candidato : candidatos) {
            System.out.println("O candidato é selecionado foi " + candidato);
        }
    }
