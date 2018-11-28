<div class="container well" ng-controller="AffichagePlanCtrl">
	<div class="row">
		<div class="col-lg-3">
			<!-- Parametrage Panel  -->
			<div class="panel panel-success">
				<div class="panel-heading">Paramétrage</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-12">
							<form novalidate role="form" class="form-horizontal" name="MyForm">
								<div class="form-group">
									<label class="col-sm-3 control-label">Fluide</label>
									<div class="col-sm-9">
										<select class="form-control" multiple ng-multiple="true"
											ng-model="test.fluide" name="fluide" required>
											<option value="P">Eau</option>
											<option value="E">Electricite</option>
											<option value="T">Haut tension</option>
										</select>
										<div
											ng-show="MyForm.fluide.$error.required && MyForm.fluide.$dirty">
											<span> Vous devez choisir un fluide</span>
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Type client</label>
									<div class="col-sm-9">
										<select class=" form-control" multiple ng-model="test.type"
											ng-multiple="true" ng-change="getLots(test.type)" name="type"
											required>
											<option value="P">Particulier</option>
											<option value="I">Industriel</option>
											<option value="A">Administrative</option>
										</select>
										<div ng-show="MyForm.type.$error.required && MyForm.type.$dirty">
											<span> Vous devez choisir un type</span>
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Lot </label>
									<div class="col-sm-9">
										<select class="form-control"
											ng-disabled=" MyForm.type.$invalid || MyForm.fluide.$invalid"
											ng-model="test.lot" 
											ng-change="getProduits(test.lot,test.fluide,test.type)"
											name="lot" required>
											<option ng-repeat="lot in Lots" value="{{lot.lotPK.numero}}">lot
												{{lot.lotPK.numero}}</option>
										</select> <span ng-show="MyForm.lot.$error.required && MyForm.lot.$dirty">
											Vous devez choisir un lot</span>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-3 control-label">Zone</label>
									<div class="col-sm-9">
										<select class="form-control" ng-model="test.zone"
											ng-options="zone as zone.numero for zone in Zones">
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Zone type</label>
									<div class="col-sm-9">
										<select class="form-control" multiple ng-model="test.typeZone">
											<option>Immeuble A</option>
											<option>Immeuble B</option>
											<option>Petite villa</option>
											<option>Grande villa</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Produit </label>
									<div class="col-sm-9">
										<select class="form-control" ng-model="test.produit"
											name="produit" ng-disabled="MyForm.lot.$invalid" required>
											<option ng-repeat="produit in Produits"
												value="{{ produit.fac_prod}} ">{{produit.fac_prod}}</option>
										</select> <span
											ng-show="MyForm.produit.$error.required && MyForm.produit.$dirty">
											Vous devez choisir un produit</span>
									</div>
								</div>
								<button type="button" class="btn btn-primary"
									ng-click="reset(form)">Effacer</button>
								<button type="submit" ng-disabled="MyForm.$invalid"
									class="btn btn btn-success" ng-click="afficher(test)">
									Valider</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-lg-9">
			<div class="panel panel-primary">
				<div class="panel-heading">Planing des tournees</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-8 col-lg-4 search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control"
									placeholder="Chercher tournée..." ng-model="TourneeNum">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-12">
							<div class="table-responsive">
								<table class="table table-bordered table-hover table-striped ">
									<thead>
										<tr>
											<th>N° Tournée</th>
											<th>Releveur</th>
											<th>Date de debut</th>
											<th>Date de fin</th>
											<th>Dernier date de lecture</th>
											<th>Nombre de jour</th>
										</tr>
									</thead>
									<tbody>
										<tr ng-repeat="tournee in Tournees| filter:TourneeNum">
											<td>{{tournee.reference}}</td>
											<td>{{tournee.releveur.nom}}</td>
											<td>{{tournee.dateDebut}}</td>
											<td>{{tournee.dateFin}}</td>
											<td>{{tournee.dernierDateLecture}}</td>
											<td>{{NumberOfDays(tournee)}}</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<nav class="page" ng-controller="PaginationDemoCtrl">
							<uib-pagination boundary-links="true" total-items="totalItems"
								ng-model="currentPage" class="pagination-sm"
								previous-text="&lsaquo;" next-text="&rsaquo;"
								first-text="&laquo;" last-text="&raquo;"> </uib-pagination>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

