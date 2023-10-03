public class testaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("The Da Vince Code","Dan Brown",2003,"Editora Random House");
        Livro livro2 = new Livro("O cálice dos Deuses: Série Percy Jackson e os olimpianos"," Rick Riordan",2023,"Intrínseca");
        Livro livro3 = new Livro("Café com Deus Pai 2024: Porções Diárias de paz ","Júnior Rostirola",2023,"Kindle");
        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());

}
}

