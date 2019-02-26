package task99.bonusTasks


/**
 * Eirik lager et spill hvor man styrer en person som skal bevege
 * seg i en 2D-verden. Kan du hjelpe ham å lage funksjonen 'moveDirection',
 * som tar inn et kart og en retning personen skal gå, og returnerer hvordan
 * kartet ser ut etter personen har bevegt seg?
 *
 * Dersom personen ikke kan bevege seg i gitt retning fordi den står inntil et
 * objekt eller kanten av banen, skal funksjonen returnere samme kart tilbake.
 * Kartet er representert av en todimensjonal liste hvor B er objekter man ikke
 * kan gå gjennom, P er spilleren som skal bevege seg og - er ledige ruter hvor
 * spilleren kan bevege seg. Hvert objekt og spilleren tar alltid en rute.
 * Retningene spilleren kan bevege seg er: 'up', 'down', 'left', 'right'.
 *
 * Eksempel:


Input:
([
  ['-', '-', '-'],
  ['-', 'P', '-'],
  ['-', 'B', '-'],
], 'up');

Result:
['-','P','-'],
['-','-','-'],
['-','B','-']

Input:
([
  ['-', '-', '-'],
  ['-', 'P', '-'],
  ['-', 'B', '-'],
], 'down');

Result:
['-','-','-'],
['-','P','-'],
['-','B','-']

Input:
([
['-', '-', '-', '-'],
['P', '-', '-', '-'],
['-', '-', '-', '-'],
['-', '-', '-', '-'],
], 'left');

Result:
['-','-','-','-'],
['P','-','-','-'],
['-','-','-','-'],
['-','-','-','-']
 */

fun main() {

}