<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Tournées
					EAU <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="#Particulier" ng-click="getLotsByType('P',1)">Particuliers
							<span class="fa arrow"></span>
					</a>
						<ul class="nav nav-third-level" ng-show="showLot">
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>
					<li><a href="#Admin" ng-click="getLotsByType('A',1)">Administartions
							<span class="fa arrow">
					</a>
						<ul class="nav nav-third-level" >
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>
					<li><a href="#Indus" ng-click="getLotsByType('I',1)">Industriels
							<span class="fa arrow">
					</a>
						<ul class="nav nav-third-level" >
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>

				</ul> <!-- /.nav-second-level --></li>
			<!-- Electricite -->
			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Tournées
					ELE <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="#" ng-click="getLotsByType('P',2)">Particuliers
							<span class="fa arrow"></span>
					</a>
						<ul class="nav nav-third-level" >
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>
					<li><a href="#" ng-click="getLotsByType('A',2)">Administartions
							<span class="fa arrow">
					</a>
						<ul class="nav nav-third-level" >
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>
					<li><a href="#" ng-click="getLotsByType('I',2)">Industriels
							<span class="fa arrow">
					</a>
						<ul class="nav nav-third-level">
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>

				</ul> <!-- /.nav-second-level --></li>

			<!-- Moyen tension -->
			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Tournéees
					MT <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li class="active"><a href="#" ng-click="getLotsByType('P',3)">Particuliers
							<span class="fa arrow"></span>
					</a>
						<ul class="nav nav-third-level" >
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>
					<li><a href="#" ng-click="getLotsByType('A',3)">Administartions
							<span class="fa arrow">
					</a>
						<ul class="nav nav-third-level" >
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>
					<li><a href="#" ng-click="getLotsByType('I',3)">Industriels
							<span class="fa arrow">
					</a>
						<ul class="nav nav-third-level" >
							<li ng-repeat="lot in listLot"><a href="#"
								ng-click="getTourneeByLot(lot)">Lot n°{{lot.lotPK.numero}}</a>
							</li>
						</ul></li>

				</ul> <!-- /.nav-second-level --></li>
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>

<div id="page-wrapper">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel-body">
					<div class="dataTable_wrapper">
						<table class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Tournée</th>
									<th>date de debut</th>
									<th>date de fin</th>
									<th>date de chargement</th>
									<!-- <th>date de Fin de chargement</th> -->
									<th>nombre Idx chargés</th>
									<th>matricule</th>
									<th>Etat Tournéee</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="tournee in listTournee">
									<td>{{tournee.reference }}</td>
									<td>{{tournee.dateDebut }}</td>
									<td>{{tournee.dateFin }}</td>
									<td>{{tournee.dateCharegement | date: "yyyy-MM-dd à HH:mm:ss" }}</td>
									<!-- <td>{{tournee.dateDecharegement}}</td> -->
									<td>{{tournee.nb_idx }}</td>
									<td><a href="#" ng-click="open('lg',tournee)">{{tournee.releveur.matricule
											}}</a></td>
									<td>
										<!-- <p>
											<span class=" text-muted">{{tournee.avancement |
												number:2}}% Complete</span>
										</p>

										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success"
												role="progressbar"
												aria-valuenow="{{tournee.avancement | number:2}}"
												aria-valuemin="0" aria-valuemax="100"
												style="width: {{tournee.avancement| number:0"></div>
										</div> --> 
										<uib-progressbar class="progress-striped active"
											max="100" value="tournee.avancement | number:0" type="success">
										<i>{{tournee.avancement | number:0}} %</i></uib-progressbar>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<!-- Model  -->
		<script type="text/ng-template" id="myModalContent.html">
		            <div class="modal-header">
		                <h3 class="modal-title">Nom: {{items.releveur.nom}} |  Matricule :{{items.releveur.matricule}}</h3>
		            </div>
		            <div class="modal-body">
		                <table class="table table-striped table-bordered table-hover">  
		                    <tbody>
		                        <tr>
		                            <th>Nombre des index chargés </th>
		                            <td>{{items.nb_idx}}</td>
		                        </tr>
		                        <tr>
		                            <th>Nombre des index lus </th>
		                            <td> {{items.nb_idx_lus}}</td>
		                        </tr>
		                        <tr>
		                            <th>Nombre des index non lus</th>
		                            <td>{{items.nb_idx_non_lus}}</td>
		                        </tr>
		                        <tr>
		                            <th>Dernier date de lecture </th>
		                            <td>{{items.dateDechargement | date: "yyyy-MM-dd à HH:mm:ss"}}</td>
		                        </tr>
		                        
		                    </tbody>

		                </table>
						<canvas id="doughnut" class="chart chart-doughnut"
  							chart-data="data" chart-labels="labels">
						</canvas> 
		            </div>
		            <div class="modal-footer">
		                <button class="btn btn-warning" type="button" ng-click="cancel()">Cancel</button>
		            </div>
		    </script>
		<!-- Fin Model -->
	</div>
</div>




