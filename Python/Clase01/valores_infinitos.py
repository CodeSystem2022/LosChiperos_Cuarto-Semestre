# Manejo de valores infinitos
import math

infinito_positivo = float("inf")
print(f"El valor de infinito_positivo es: {infinito_positivo}")
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = float("-inf")
print(f"El valor de infinito_negativo es: {infinito_negativo}")
print(f'Es infinito? {math.isinf(infinito_negativo)}')