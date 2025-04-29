vocabulary = ["the", "quick", "brown", "fox"]
word_to_index = {word: i for i, word in enumerate(vocabulary)}
index_to_word = {i: word for i, word in enumerate(vocabulary)}

input_sequence = [word_to_index["the"], word_to_index["quick"], word_to_index["brown"]]
target_index = word_to_index["fox"]
predicted_index = 3 
predicted_word = index_to_word[predicted_index]
print(f"Input sequence indices: {input_sequence}")
print(f"Target word index: {target_index}")
print(f"Predicted word: {predicted_word}")