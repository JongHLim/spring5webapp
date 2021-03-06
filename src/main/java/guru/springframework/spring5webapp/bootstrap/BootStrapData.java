package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;
  private final PublisherRepository publisherRepository;

  public BootStrapData(AuthorRepository authorRepository,
                       BookRepository bookRepository,
                       PublisherRepository publisherRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    this.publisherRepository = publisherRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    Author eric = new Author("Eric", "Evans");
    Book ddd = new Book("Domain Driven Design", "123123");
    eric.getBooks().add(ddd);
    ddd.getAuthor().add(eric);

    authorRepository.save(eric);
    bookRepository.save(ddd);

    Author rod = new Author("Rod", "johnson");
    Book noEJB = new Book("J2EE Developer without EJB", "123123123");
    rod.getBooks().add(noEJB);
    noEJB.getAuthor().add(rod);

    authorRepository.save(rod);
    bookRepository.save(noEJB);

    System.out.println("Started in Bootstrap");
    System.out.println("Number of books: " + bookRepository.count());

    Publisher jon = new Publisher("Jon's publishing", "1234 S Main", "Test City", "Utah", "12312");

    publisherRepository.save(jon);
    System.out.println("Number of publishers: " + publisherRepository.count());

  }
}
