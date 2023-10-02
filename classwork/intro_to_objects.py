def func(x):
    const = x
    def get_const():
        return const
    return get_const
  
class Sandwich:
    def __init__(self, bread, fillings, condiments = None):
        self.bread = bread
        self.condiments = condiments
        self.fillings = fillings
    def get_bread(self):
        return self.bread


ham = Sandwich("white", "ham", "mustard")
print(ham.fillings)

turkey = Sandwich("rye", "turkey")
print(turkey.get_bread())

liverwurst = Sandwich("pumpernickel", ["liverwurst", "onions"], ["mayo", "mustard"])
print(liverwurst.fillings)