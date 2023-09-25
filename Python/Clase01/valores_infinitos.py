# Manejo de valores infinitos
import math
from decimal import Decimal

infinito_positivo = float("inf")
print(f"El valor de infinito_positivo es: {infinito_positivo}")
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = float("-inf")
print(f"El valor de infinito_negativo es: {infinito_negativo}")
print(f'Es infinito? {math.isinf(infinito_negativo)}')

#Modulo Math
infinito_positivo = math.inf
print(f"El valor de infinito_positivo es: {infinito_positivo}")
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = -math.inf
print(f"El valor de infinito_negativo es: {infinito_negativo}")
print(f'Es infinito? {math.isinf(infinito_negativo)}')

#Modulo decimal
infinito_positivo = Decimal("Infinity")
print(f"El valor de infinito_positivo es: {infinito_positivo}")
print(f'Es infinito? {math.isinf(infinito_positivo)}')

infinito_negativo = Decimal("-Infinity")
print(f"El valor de infinito_negativo es: {infinito_negativo}")
print(f'Es infinito? {math.isinf(infinito_negativo)}')
