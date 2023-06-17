const DNA_TO_RNA = {
  G: "C",
  C: "G",
  T: "A",
  A: "U",
};

type DnaKey = keyof typeof DNA_TO_RNA;

export function toRna(dna: string): string {
  let rna = Array.from(dna);

  for (let i = 0; i < dna.length; i++) {
    const dnaKey = rna[i] as DnaKey;

    if (!(dnaKey in DNA_TO_RNA)) throw Error("Invalid input DNA.");

    rna[i] = DNA_TO_RNA[dnaKey];
  }

  return rna.join("");
}
