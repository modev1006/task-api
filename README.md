# Task API - Gestionnaire de Tâches Professionnel

Bienvenue dans le projet **Task API**, une application Spring Boot robuste pour la gestion de tâches, accompagnée de ses scripts de déploiement automatisés via Ansible.

## 🚀 Fonctionnalités
- **Gestion des tâches** : API REST complète pour créer, lire, mettre à jour et supprimer des tâches.
- **Architecture Pro** : Séparation nette entre le cœur de l'application et l'API.
- **Conteneurisation** : Prêt pour Docker avec un `Dockerfile` optimisé.
- **Déploiement Automatisé** : Scripts Ansible inclus pour un déploiement rapide sur serveur distant.

## 🛠️ Prérequis
- Java 17+
- Maven 3.8+
- Docker (optionnel, pour la conteneurisation)
- Ansible (pour le déploiement)

## 📦 Installation et Lancement

### Localement
1. Clonez le dépôt :
   ```bash
   git clone https://github.com/modev1006/task-api.git
   cd task-api
   ```
2. Compilez le projet :
   ```bash
   ./mvnw clean install
   ```
3. Lancez l'application :
   ```bash
   ./mvnw spring-boot:run
   ```

### Via Docker
```bash
docker build -t task-api .
docker run -p 8080:8080 task-api
```

## 🚢 Déploiement (Ansible)
Les fichiers de déploiement se trouvent à la racine :
- `playbook.yml` : Le scénario de déploiement.
- `inventory.ini` : La configuration des serveurs cibles.

Pour déployer :
```bash
ansible-playbook -i inventory.ini playbook.yml
```

---
*Projet réalisé dans le cadre du cours DevOps L3GL ISI 2026.*