from logger_base import log
from conexion import Conexion

# clase cursor del pool de conexiones
class CursorDelPool:
    def __init__(self):
        self._conexion = None
        self._cursor = None


    # dunders methods
    def __enter__(self): 
        log.debug('Inicio del método with y __enter__')
        self._conexion = Conexion.obtenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor
    
    # __exit__ se ejecuta al final del bloque with
    def __exit__(self, tipo_exception, valor_exception, detalle_exception):
        log.debug('Se ejecuta el método exit')

        if valor_exception: #si es verdadero
            self._conexion.rollback()
            log.debug(f'Ocurrió una excepción: {valor_exception}')
        else:
            self._conexion.commit() #se hace el commit de la conexión
            log.debug('Commit de la transacción')
        self._cursor.close() #cerramos la conexión
        Conexion.liberarConexion(self._conexion) # liberamos la conexión del pool de conexiones
    

# 11.3 Método main para probar la clase CursorDelPool
if __name__ == '__main__':
    with CursorDelPool() as cursor:
        log.debug('Dentro del bloque with')
        cursor.execute('SELECT * FROM persona')
        log.debug(cursor.fetchall())
             
