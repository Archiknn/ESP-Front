import { Component, ViewEncapsulation } from '@angular/core';
import {trigger, state, style, transition, animate} from '@angular/animations';
import { OnInit} from '@angular/core/src/metadata/lifecycle_hooks';
// import * as $ from 'jquery';

declare var $: any;


export interface TipoDocumento {
    value: string;
    viewValue: string;
}

export interface Pais {
    value: string;
    viewValue: string;
}

export interface Departamento {
    value: string;
    viewValue: string;
}

export interface Ciudad {
    value: string;
    viewValue: string;
}

export interface EstadoCivil {
    value: string;
    viewValue: string;
}

export interface GrupoSanguineo {
    value: string;
    viewValue: string;
}

@Component({
  selector: 'app-aspirante-datos',
  templateUrl: './aspirantedatos.component.html',
  styleUrls: ['./aspirantedatos.component.css'],
  animations: [
        trigger('animation', [
            state('visible', style({
                transform: 'translateX(0)',
                opacity: 1
            })),
            transition('void => *', [
                style({transform: 'translateX(50%)', opacity: 0}),
                animate('300ms ease-out')
            ]),
            transition('* => void', [
                animate(('250ms ease-in'), style({
                    height: 0,
                    opacity: 0,
                    transform: 'translateX(50%)'
                }))
            ])
        ])
    ],
    encapsulation: ViewEncapsulation.None
})


export class AspirantedatosComponent implements OnInit {

    arrayRedSocial: number[];
    arrayRSConguye: number[];
    arrayNHijos: number[];
    arrayNHermanos: number[];
    arrayRSHermano: number[];
    arrayEstudioAspirante: number[];
    arrayIdiomaAspirante: number[];
    arrayEmpresaAspirante: number[];
    arrayReferenciaPersonal: number[];
    arrayReferenciaMilitar: number[];
    arrayOtroIngreso: number[];
    arrayCuentas: number[];
    arrayBienPatrimonial: number[];
    arrayObligacionCrediticia: number[];
    arrayONG: number[];
    arrayActividadEconomica: number [];
    arrayViajes: number[];
    arrayOrganismos: number[];
    arrayRecomendador: number[];
    arrayAntecedentes: number[];


    tiposdocumentos: TipoDocumento[] = [
        {value: 'Cedula', viewValue: 'C.C'},
        {value: 'Pasaporte', viewValue: 'Pasaporte'},
        {value: 'Tarjeta-Identidad', viewValue: 'T.I'}
    ];

    paises: Pais[] = [
        {value: 'Colombia', viewValue: 'Colombia'},
        {value: 'EE.UU', viewValue: 'EE.UU'},
        {value: 'Argentina', viewValue: 'Argentina'},
        {value: 'Uruguay', viewValue: 'Uruguay'},
        {value: 'Paraguay', viewValue: 'Paraguay'},
        {value: 'Chile', viewValue: 'Chile'},
        {value: 'Argentina', viewValue: 'Argentina'}
    ];

    departamentos: Departamento[] = [
        {value: 'Cundinamarca', viewValue: 'Cundinamarca'},
        {value: 'Santander', viewValue: 'Santander'},
        {value: 'Boyacá', viewValue: 'Boyacá'},
        {value: 'Nariño', viewValue: 'Nariño'},
        {value: 'Meta', viewValue: 'Meta'},
        {value: 'Valle', viewValue: 'Valle'},
        {value: 'Antioquia', viewValue: 'Antioquia'}
    ];

    ciudades: Ciudad[] = [
        {value: 'Bogotá', viewValue: 'Bogotá'},
        {value: 'Madrid', viewValue: 'Madrid'},
        {value: 'Mosquera', viewValue: 'Mosquera'},
        {value: 'Facatátiva', viewValue: 'Facatátiva'},
        {value: 'Chia', viewValue: 'Chia'},
        {value: 'Cajicá', viewValue: 'Cajicá'},
        {value: 'Zipaquirá', viewValue: 'Zipaquirá'}
    ];

    estadosciviles: EstadoCivil[] = [
        {value: 'Soltero', viewValue: 'Soltero'},
        {value: 'Casado', viewValue: 'Casado'},
        {value: 'Union Libre', viewValue: 'Union Libre'},
        {value: 'Divorciado', viewValue: 'Divorciado'},
        {value: 'Viudo', viewValue: 'Viudo'}
    ];

    grupossanguineos: GrupoSanguineo[] = [
        {value: 'O-', viewValue: 'O-'},
        {value: 'O+', viewValue: 'O+'},
        {value: 'A-', viewValue: 'A-'},
        {value: 'A+', viewValue: 'A+'},
        {value: 'B-', viewValue: 'B-'},
        {value: 'B+', viewValue: 'B+'},
        {value: 'AB-', viewValue: 'AB-'},
        {value: 'AB+', viewValue: 'AB+'}
    ];


    mensaje() {
        window.alert('¡Datos Guardados Correctamente!');
    }

    constructor() {
    }




    ngOnInit() {

        $(document).ready(function () {
            $('#boton').click(function () {
                window.alert('Hola');
            });
        });



        this.arrayRSConguye = [0];
        this.arrayNHijos = [0];
        this.arrayNHermanos = [0];
        this.arrayRSHermano = [0];
        this.arrayEstudioAspirante = [0];
        this.arrayIdiomaAspirante = [0];
        this.arrayRedSocial = [0];
        this.arrayEmpresaAspirante = [0];
        this.arrayReferenciaPersonal = [0];
        this.arrayReferenciaMilitar = [0];
        this.arrayOtroIngreso = [0];
        this.arrayCuentas = [0];
        this.arrayBienPatrimonial = [0];
        this.arrayObligacionCrediticia = [0];
        this.arrayONG = [0];
        this.arrayActividadEconomica = [0];
        this.arrayViajes = [0];
        this.arrayOrganismos =  [0];
        this.arrayRecomendador = [0];
        this.arrayAntecedentes = [0];

    }

    agregarRedSocial() {
        this.arrayRedSocial.push(this.arrayRedSocial.length);
    }
    quitarRedSocial() {
        this.arrayRedSocial.splice(-1, 1);
    }

    agregarRSConyugue() {
            this.arrayRSConguye.push(this.arrayRSConguye.length);
    }
    quitarRSConyugue() {
            this.arrayRSConguye.splice(-1, 1);
    }

    agregarHijo() {
            this.arrayNHijos.push(this.arrayNHijos.length);
    }
    quitarHijo() {
        this.arrayNHijos.splice(-1, 1);
    }

    agregarHermano() {
        this.arrayNHermanos.push(this.arrayNHermanos.length);
    }
    quitarHermano() {
        this.arrayNHermanos.splice(-1, 1);
    }

    agregarRSHermano() {
        this.arrayRSHermano.push(this.arrayRSHermano.length);
    }
    quitarRSHermano() {
        this.arrayRSHermano.splice(-1, 1);
    }

    agregarEstudioAspirante() {
        this.arrayEstudioAspirante.push(this.arrayEstudioAspirante.length);
    }
    quitarEstudioAspirante() {
        this.arrayEstudioAspirante.splice(-1, 1);
    }

    agregarIdiomaAspirante() {
        this.arrayIdiomaAspirante.push(this.arrayIdiomaAspirante.length);
    }
    quitarIdiomaAspirante() {
        this.arrayIdiomaAspirante.splice(-1, 1);
    }

    agregarEmpresaAspirante() {
        this.arrayEmpresaAspirante.push(this.arrayEmpresaAspirante.length);
    }
    quitarEmpresaAspirante() {
        this.arrayEmpresaAspirante.splice(-1, 1);
    }

    agregarReferenciaPersonal() {
        this.arrayReferenciaPersonal.push(this.arrayReferenciaPersonal.length);
    }
    quitarReferenciaPersonal() {
        this.arrayReferenciaPersonal.splice(-1, 1);
    }

    agregarReferenciaMilitar() {
        this.arrayReferenciaMilitar.push(this.arrayReferenciaMilitar.length);
    }
    quitarReferenciaMilitar() {
        this.arrayReferenciaMilitar.splice(-1, 1);
    }

    agregarOtrosIngresos() {
        this.arrayOtroIngreso.push(this.arrayOtroIngreso.length);
    }
    quitarOtrosIngresos() {
        this.arrayOtroIngreso.splice(-1, 1);
    }

    agregarCuenta() {
        this.arrayCuentas.push(this.arrayCuentas.length);
    }
    quitarCuenta() {
        this.arrayCuentas.splice(-1, 1);
    }

    agregarBien() {
        this.arrayBienPatrimonial.push(this.arrayBienPatrimonial.length);
    }
    quitarBien() {
        this.arrayBienPatrimonial.splice(-1, 1);
    }

    agregarObligacion() {
        this.arrayObligacionCrediticia.push(this.arrayObligacionCrediticia.length);
    }
    quitarObligacion() {
        this.arrayObligacionCrediticia.splice(-1, 1);
    }

    agregarONG() {
        this.arrayONG.push(this.arrayONG.length);
    }
    quitarONG() {
        this.arrayONG.splice(-1, 1);
    }

    agregarActividad() {
        this.arrayActividadEconomica.push(this.arrayActividadEconomica.length);
    }
    quitarActividad() {
        this.arrayActividadEconomica.splice(-1, 1);
    }

    agregarViaje() {
        this.arrayViajes.push(this.arrayViajes.length);
    }
    quitarViaje() {
        this.arrayViajes.splice(-1, 1);
    }

    agregarOrganismos() {
        this.arrayOrganismos.push(this.arrayOrganismos.length);
    }
    quitarOrganismos() {
        this.arrayOrganismos.splice(-1, 1);
    }

    agregarRecomedacion() {
        this.arrayRecomendador.push(this.arrayRecomendador.length);
    }
    quitarRecomedacion() {
        this.arrayRecomendador.splice(-1, 1);
    }

    agregarAntecedente() {
        this.arrayAntecedentes.push(this.arrayAntecedentes.length);
    }
    quitarAntecedente() {
        this.arrayAntecedentes.splice(-1, 1);
    }
}
