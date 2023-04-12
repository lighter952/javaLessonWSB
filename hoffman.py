
def decimal_to_binary(n):
    # converting decimal to binary
    # and removing the prefix(0b)
    return bin(n).replace("0b", "")

source = "ABACCADADCBD"
l = []
bin_l = []
for c in source:
    if c not in l:
        l.append(c)
        bin_l.append(decimal_to_binary(l.index(c)))

for el in bin_l:
    if len(el) < len(bin_l[len(bin_l) - 1]):
        a = "0" + el
        bin_l[bin_l.index(el)] = a


a = dict(zip(l, bin_l))
print(a)

for c in source:
    


