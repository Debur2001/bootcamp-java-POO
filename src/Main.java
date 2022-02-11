import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("curso de Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("aprendendo curso Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Sportheca Mobile Developer");
        bootcamp.setDescricao("do 0 ao dev em Android Nativo");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos " + devVinicius.getNome() + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("Conteudos incritos " + devVinicius.getNome() + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos incritos " + devVinicius.getNome() + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devVinicius.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos " + devRafael.getNome() + devRafael.getConteudosInscritos());
        devRafael.progredir();
        System.out.println("Conteudos incritos " + devRafael.getNome() + devRafael.getConteudosInscritos());
        System.out.println("Conteudos incritos " + devRafael.getNome() + devRafael.getConteudosConcluidos());
    }
}
