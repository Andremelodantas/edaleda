package vetor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vetor.ComparadorMaximo;
import vetor.ComparadorMinimo;
import vetor.Vetor;

public class VetorTest {

	private Vetor<Aluno> vetorNaoVazio;
	private Vetor<Aluno> vetorVazio;

	@Before
	public void setUp() throws Exception {
		vetorNaoVazio = new Vetor<Aluno>(10);
		vetorVazio = new Vetor<Aluno>(1);
		ComparadorMaximo compMax = new ComparadorMaximo();
		vetorNaoVazio.setComparadorMaximo(compMax);
		vetorVazio.setComparadorMaximo(compMax);
		ComparadorMinimo compMin = new ComparadorMinimo();
		vetorNaoVazio.setComparadorMinimo(compMin);
		vetorVazio.setComparadorMinimo(compMin);
	}
	
	@Test
	public void inserirTest(){
		Aluno c = new Aluno("Cleiton", 6);
		vetorNaoVazio.inserir(c);
		assertFalse(vetorNaoVazio.isVazio());
	}
	
	@Test
	public void removerTest() {
		Aluno c = new Aluno("Cleiton", 6);
		vetorNaoVazio.inserir(c);
		assertFalse(vetorNaoVazio.isVazio());
		vetorNaoVazio.remover(c);
		assertTrue(vetorNaoVazio.isVazio());
	}
	
	@Test
	public void isVaziotest() {
		assertTrue(vetorVazio.isVazio());
	}
	
	@Test
	public void isCheioTest() {
		for(int i = 0;i < 10;i++) {
			Aluno a = new Aluno("André", 8);
			vetorNaoVazio.inserir(a);
		}
		assertTrue(vetorNaoVazio.isCheio());
	}
	
	@Test
	public void maximoTest(){
		Aluno a = new Aluno("André" , 8);
		Aluno c = new Aluno("Cleiton", 6);
		vetorNaoVazio.inserir(a);
		vetorNaoVazio.inserir(c);
		assertEquals(a,vetorNaoVazio.maximo());
	}
	
	@Test
	public void minimoTest(){
		Aluno a = new Aluno("André" , 8);
		Aluno c = new Aluno("Cleiton", 6);
		vetorNaoVazio.inserir(a);
		vetorNaoVazio.inserir(c);
		assertEquals(c,vetorNaoVazio.minimo());
	}
}
