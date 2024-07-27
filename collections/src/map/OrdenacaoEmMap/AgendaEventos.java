package map.OrdenacaoEmMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
	  
	  this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
	  
	  eventosMap.put(data, new Evento(nome, atracao));
    
  }

  public void exibirAgenda() {
	  
	  Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    
	  System.out.println(eventosTreeMap);
    
  }

  public void obterProximoEvento() {
	  
//	  Set<LocalDate> dateSet = eventosMap.keySet();
//	  Collection<Evento> values = eventosMap.values();
	  
	  //data atual
	 LocalDate dataAtual = LocalDate.now();
	 LocalDate proximaData =null;
	 Evento proximoEvento = null;
	 
	 Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
	  
	 for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
		 
		 if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
			 
			 proximaData = entry.getKey();
			 proximoEvento = entry.getValue();
			 
			 System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
			 break;
		  }
	  }
	  
	  
  }

  public static void main(String[] args) {
	  
	  AgendaEventos agendaEventos = new AgendaEventos();

	  // Adicionar eventos à agenda
	  agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
	  agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
	  agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
	  agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 10), "Evento 4", "Atração 4");
	  agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 10), "Evento 5", "Atração 5");

	
	  // Exibe a agenda completa de eventos
	  agendaEventos.exibirAgenda();
	
	  // Obtém e exibe o próximo evento na agenda
	  agendaEventos.obterProximoEvento();
	  
	  
	  }
} 