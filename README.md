(Layered Structure)
Die Aufgabe bezieht sich auf die Aufgabe 'Product-Repository', die ihr zuletzt gemacht habt.
*
* Schritt 1: Füge in der von euch zuletzt gemachten Aufgabe eine Service Schicht hinzu.
* ———————
  Aufgabe CRUD
  Wenn ihr gestern nicht zur Bonus Aufgabe gekommen seid, dann...
*
* implementiert einen Endpunkt im ProductController, der ein Produkt erstellt.
  ————————
  Aufgabe DTO
* Erstelle ein DTO für den POST-Endpunkt, damit der Client keine Id für das neue Produkt mit angeben kann.
* ——————
  Bonus Aufgabe CRUD
  Wenn ihr es nicht gestern schon geschafft habt, ...
*
* implementiert einen Endpunkt im ProductController, der ein Produkt anhand seiner id zurückgibt.
* implementiert einen Endpunkt im ProductController, der ein Produkt anhand seiner id löscht.
* implementiert einen Endpunkt im ProductController, der ein Produkt anhand seiner id aktualisiert
* ——————
  Bonus Aufgabe Services
  Nutze eine von Java zufalls generierte Id für neue Produkte.
*
* Erstelle eine IdService Klasse, mit ein Methode public String randomId() diese soll die Klasse UUID nutzen um eine zufällige Id zu generieren.
* Nutzte Dependency Injection im ProductService, um die IdService Klasse zu injecten und beim erstellen von neuen Produkten eine Id zu generieren.
* —————
  Bonus Aufgabe Query
  Wenn nicht gestern schon bearbeitet, befolge die folgenden Schritte nacheinander:
*
* Schritt 1: Füge zu deinem getAllProducts-Endpunkt einen Query-Parameter price hinzu.
* Schritt 2: Filter anhand dieses Parameters alle Produkte die maximal diesen Preis haben. (Lade zuerst alle Products aus der Datenbank und nutze zum Filtern uns bekannte Java Methoden)
* Schritt 3: Schaue dir Generated Query Methods an und nutze diese um die Produkte direkt gefiltert aus der Datenbank zu laden query-methoden.(Nur Abschnitt 3 lesen)