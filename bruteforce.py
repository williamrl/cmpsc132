import itertools

charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;':\",./<>?"  # define the character set to use
max_length = 8  # define the maximum length of the password to try

def test_password(password):
    # add your code to test the password here
    # replace the following line with your own code
    return password == "correct_password"

for length in range(1, max_length + 1):  # try all lengths up to max_length
    for guess in itertools.product(charset, repeat=length):  # generate all possible combinations of the character set
        password = "".join(guess)  # join the characters into a string
        print(f"Trying password: {password}")  # print the password being tried
        if test_password(password):
            print(f"Password found: {password}")
            break
