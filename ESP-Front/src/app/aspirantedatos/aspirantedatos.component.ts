import {Component, Injectable, ViewEncapsulation} from '@angular/core';
import {trigger, state, style, transition, animate} from '@angular/animations';
import {OnInit} from '@angular/core/src/metadata/lifecycle_hooks';
import {HttpClient} from '@angular/common/http';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {User} from './User';

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

@Injectable()
export class AspirantedatosComponent implements OnInit {

    private putURL = 'http://localhost:8080/esp/insertarAspirante';
    private userUrl = 'http://localhost:8080/esp/consultar';
    form_1: FormGroup;
    imageURL: string = '/assets/img/default.png';
    imagenASubir: File = null;

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
        {value: 'C.C', viewValue: 'C.C'},
        {value: 'Pasaporte', viewValue: 'Pasaporte'},
        {value: 'T.I', viewValue: 'T.I'}
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

    constructor(private http: HttpClient) {
    }

    aspirante: User = new User();

    getUserById(id: string) {
        id = '204ed8f7-a44b-47bf-b8a0-7931d15fe959';
        return console.log(this.http.get<User>(this.userUrl + '/' + id).subscribe());
        // console.log(this.aspirante.primerApellido);
    }

     putAspirante = function (aspirante) {
         return this.http.post(this.putURL,
             {
                 'aspirante': {
                     'primerApellido' : aspirante.pApellido,
                     'segundoApellido' : aspirante.sApellido,
                     'primerNombre' : aspirante.pNombre,
                     'segundoNombre' : aspirante.sNombre,
                     'tipoDocumento' : aspirante.slctTDA,
                     'numeroDocumento' : aspirante.nDocumento,
                     'fechaExpedicionDocumento' : aspirante.fExpedicion,
                     'paisExpedicionDocumento' : aspirante.slctPEDA,
                     'departamentoExpedicionDocumento' : aspirante.slctDEDA,
                     'ciudadExpedicionDocumento' : aspirante.slctCEDA,
                     'numeroPasaporte' : aspirante.nPasaporte,
                     'departamentoExpedicionPasaporte' : aspirante.slctDEPA,
                     'ciudadExpedicionPasaporte' : aspirante.slctCEPA,
                     'paisNacimiento' : aspirante.slctPNA,
                     'departamentoNacimiento' : aspirante.slctDNA,
                     'ciudadNacimiento' : aspirante.slctCNA,
                     'fechaNacimiento' : aspirante.fNacimiento,
                     'estadoCivil' : aspirante.slctECA,
                     'grupoSanguineo' : aspirante.slctGSA,
                     'ocupacion' : aspirante.puOficioA,
                     'numeroTarjetaProfesional' : aspirante.tProfesionalA,
                     'estatura' : aspirante.estaturaA,
                     'peso' : aspirante.pesoA,
                     'direccionActual' : aspirante.dAspirante,
                     'barrioActual' : aspirante.bAspirante,
                     'departamentoDireccionActual' : aspirante.slctDRActA,
                     'ciudadDireccionActual' : aspirante.slctCRActA,
                     'direccionAnterior' : aspirante.dAAspirante,
                     'barrioAnterior' : aspirante.bAAspirante,
                     'departamentoDireccionAnterior' : aspirante.slctDRAntA,
                     'ciudadDireccionAnterior' : aspirante.slctCRActA,
                     'numeroCelular' : aspirante.nTCAspirante,
                     'numeroTelefonoActual' : aspirante.nTFAspirante,
                     'numeroTelefonoAnterior' : aspirante.nTRAspirante,
                     'correoElectronico' : aspirante.cEelecAspirante,
                     'redesSociales' : aspirante.rSocialesA
                 },
                 'libretaMilitar' : {
                     'numero' : aspirante.nLMAspirante,
                     'numeroDocumentoAspirante' : aspirante.nDocumento,
                     'clase' : aspirante.cLMAspirante,
                     'distrito' : aspirante.dLMilitar,
                     'fechaExpedicion' :  aspirante.fELMAspirante
                 }/*,
                 'companeraSentimental' : {
                     'numeroDocumento' : aspirante.nDCSentimental,
                     'numeroDocumentoAspirante' : aspirante.nDocumento,
                     'tipoDocumento' : aspirante.slctTDCSA,
                     'primerApellido' : aspirante.pACSentimental,
                     'segundoApellido' : aspirante.sACSentimental,
                     'primerNombre' : aspirante.pNCSentimental,
                     'segundoNombre' : aspirante.sNCSentimental,
                     'ocupacion' : aspirante.pUOCSentimental,
                     'direccion' : aspirante.dCSentimental,
                     'departamentoDireccion' : aspirante.slctDDCSA,
                     'ciudadDireccion' : aspirante.slctCDCSA,
                     'numeroCelular' : aspirante.nCCSentimental,
                     'numeroTelefono' : aspirante.nTCSentimental,
                     'correoElectronico' : aspirante.cECSentimental,
                     'redesSociales' : aspirante.rSCSentimental
                 }*/
             }).subscribe();


    };

    ngOnInit() {

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

        this.form_1 = new FormGroup({

            // Aspirante
            pApellido: new FormControl('', [Validators.maxLength(20), Validators.required]),
            sApellido: new FormControl('', [Validators.maxLength(20), Validators.required]),
            pNombre: new FormControl('', [Validators.maxLength(20), Validators.required]),
            sNombre: new FormControl('', [Validators.maxLength(20)]),
            slctTDA: new FormControl('', [Validators.required]),
            nDocumento: new FormControl('', [Validators.maxLength(20), Validators.required ]),
            fExpedicion: new FormControl('', [Validators.required]),
            slctPEDA: new FormControl('', [Validators.required]),
            slctDEDA: new FormControl('', [Validators.required]),
            slctCEDA: new FormControl('', [Validators.required]),

            nPasaporte: new FormControl('', [Validators.maxLength(20)]),
            slctDEPA: new FormControl(''),
            slctCEPA: new FormControl(''),

            nLMAspirante: new FormControl('', [Validators.maxLength(10)]),
            cLMAspirante: new FormControl('', [Validators.maxLength(10)]),
            dLMilitar: new FormControl('', [Validators.maxLength(2)]),
            fELMAspirante: new FormControl(''),

            slctPNA: new FormControl('', [Validators.required]),
            slctDNA: new FormControl('', [Validators.required]),
            slctCNA: new FormControl('', [Validators.required]),
            fNacimiento: new FormControl('', [Validators.required]),

            dAspirante: new FormControl('', [Validators.maxLength(30), Validators.required]),
            bAspirante: new FormControl('', [Validators.maxLength(30), Validators.required]),
            nTCAspirante: new FormControl('', [Validators.maxLength(10)]),
            nTFAspirante: new FormControl('', [Validators.maxLength(10)]),
            slctDRActA: new FormControl('', [Validators.required]),
            slctCRActA: new FormControl('', [Validators.required]),

            dAAspirante: new FormControl('', [Validators.maxLength(30)]),
            bAAspirante: new FormControl('', [Validators.maxLength(20)]),
            slctDRAntA: new FormControl(''),
            slctCRAntA: new FormControl(''),
            nTRAspirante: new FormControl('', [Validators.maxLength(10)]),

            slctECA: new FormControl('', [Validators.required]),
            slctGSA: new FormControl('', [Validators.required]),
            puOficioA: new FormControl('', [Validators.required, Validators.maxLength(50)]),
            tProfesionalA: new FormControl('', [Validators.maxLength(20)]),
            estaturaA: new FormControl('', [Validators.maxLength(3), Validators.required]),
            pesoA: new FormControl('', [Validators.maxLength(3), Validators.required]),
            cEelecAspirante: new FormControl('', [Validators.maxLength(30)]),
            rSocialesA: new FormControl('', [Validators.maxLength(100)]),


            // Compañera(o) Sentimental
            pACSentimental: new FormControl('', [Validators.maxLength(20)]),
            sACSentimental: new FormControl('', [Validators.maxLength(20)]),
            pNCSentimental: new FormControl('', [Validators.maxLength(20)]),
            sNCSentimental: new FormControl('', [Validators.maxLength(20)]),
            slctTDCSA: new FormControl(''),
            nDCSentimental: new FormControl('', [Validators.maxLength(20)]),
            pUOCSentimental: new FormControl('', [Validators.maxLength(50)]),
            dCSentimental: new FormControl('', [Validators.maxLength(30)]),
            slctDDCSA: new FormControl(''),
            slctCDCSA: new FormControl(''),
            nCCSentimental: new FormControl('', [Validators.maxLength(10)]),
            nTCSentimental: new FormControl('', [Validators.maxLength(10)]),
            cECSentimental: new FormControl('', [Validators.maxLength(30)]),
            rSCSentimental: new FormControl('', [Validators.maxLength(100)]),

        });
    }

    handleFileInput(file: FileList) {
        this.imagenASubir = file.item(0);

        const reader = new FileReader();
        reader.onload = (event: any) => {
            this.imageURL = event.target.result;
        };
        reader.readAsDataURL(this.imagenASubir);
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
