PGDMP         
                 {            PERN    15.2    15.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    40970    PERN    DATABASE     }   CREATE DATABASE "PERN" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Argentina.1252';
    DROP DATABASE "PERN";
                postgres    false            �            1259    40972    tareas    TABLE     z   CREATE TABLE public.tareas (
    id integer NOT NULL,
    titulo character varying(255) NOT NULL,
    descripcion text
);
    DROP TABLE public.tareas;
       public         heap    postgres    false            �            1259    40971    tareas_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tareas_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.tareas_id_seq;
       public          postgres    false    215                        0    0    tareas_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.tareas_id_seq OWNED BY public.tareas.id;
          public          postgres    false    214            e           2604    40975 	   tareas id    DEFAULT     f   ALTER TABLE ONLY public.tareas ALTER COLUMN id SET DEFAULT nextval('public.tareas_id_seq'::regclass);
 8   ALTER TABLE public.tareas ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    215    214    215            �          0    40972    tareas 
   TABLE DATA           9   COPY public.tareas (id, titulo, descripcion) FROM stdin;
    public          postgres    false    215   �                  0    0    tareas_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.tareas_id_seq', 6, true);
          public          postgres    false    214            g           2606    40979    tareas tareas_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.tareas
    ADD CONSTRAINT tareas_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.tareas DROP CONSTRAINT tareas_pkey;
       public            postgres    false    215            i           2606    40981    tareas tareas_titulo_key 
   CONSTRAINT     U   ALTER TABLE ONLY public.tareas
    ADD CONSTRAINT tareas_titulo_key UNIQUE (titulo);
 B   ALTER TABLE ONLY public.tareas DROP CONSTRAINT tareas_titulo_key;
       public            postgres    false    215            �   ,   x�3�I,JMT0���THI-N.�,H����2�H����qqq ���     