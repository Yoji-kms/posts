package ru.netology.attachment

import ru.netology.attachment.types.*

sealed class Attachment{
    abstract val attachmentType: AttachmentType

    data class AttachmentAudio (val audio: Audio): Attachment() {
        override val attachmentType = AttachmentType.AUDIO
    }

    data class AttachmentVideo (val video: Video): Attachment(){
        override val attachmentType = AttachmentType.VIDEO
    }

    data class AttachmentPhoto (val photo: Photo): Attachment(){
        override val attachmentType = AttachmentType.PHOTO
    }

    data class AttachmentDoc (val doc: Doc): Attachment(){
        override val attachmentType = AttachmentType.DOC
    }

    data class AttachmentLink (val link: Link): Attachment(){
        override val attachmentType = AttachmentType.LINK
    }
}