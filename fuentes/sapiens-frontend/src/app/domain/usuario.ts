import { Opcion } from './opcion';

export class Usuario {
    apellido: string;
    celular: string;
    codigo: string;
    correo: string;
    estadoRegisttro: string;
    fechaCreacion: Date;
    fechaModificacion: Date;
    genero: string;
    identificacion: number;
    nombre: string;
    password: string;
    usuCreador: number;
    usuModificador: number;
    usuaId: number;
    progId_Programa: number;
    tiusId_TipoUsuario: number;

    facuId: number;
    nombreFacultad: string;
    progId: number;
    nombrePrograma: string;


    perfil: string;

    opciones: Opcion[];
}