package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Handshake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,17.0f)
                lineTo(13.0f,19.0f)
                curveTo(13.535092f,19.5399f,14.318163f,19.752228f,15.052696f,19.556583f)
                curveTo(15.7872305f,19.360939f,16.360939f,18.78723f,16.556583f,18.052696f)
                curveTo(16.752228f,17.318163f,16.5399f,16.535093f,16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,14.0f)
                lineTo(16.5f,16.5f)
                curveTo(17.035093f,17.0399f,17.818163f,17.252228f,18.552696f,17.056583f)
                curveTo(19.28723f,16.860939f,19.860939f,16.28723f,20.056583f,15.552696f)
                curveTo(20.252228f,14.818163f,20.0399f,14.035092f,19.5f,13.5f)
                lineTo(15.62f,9.62f)
                curveTo(14.4487295f,8.450187f,12.5512705f,8.450187f,11.38f,9.62f)
                lineTo(10.5f,10.5f)
                curveTo(9.964908f,11.0399f,9.181837f,11.252228f,8.447304f,11.056583f)
                curveTo(7.7127695f,10.860938f,7.1390615f,10.2872305f,6.943417f,9.552696f)
                curveTo(6.747772f,8.818163f,6.9600997f,8.035092f,7.5f,7.5f)
                lineTo(10.309999f,4.69f)
                curveTo(12.186756f,2.8181517f,15.094956f,2.4597757f,17.369999f,3.8200002f)
                lineTo(17.839998f,4.1000004f)
                curveTo(18.265785f,4.3569875f,18.772045f,4.4461174f,19.259998f,4.3500004f)
                lineTo(21.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(22.0f,14.0f)
                lineTo(20.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(2.0f,14.0f)
                lineTo(8.5f,20.5f)
                curveTo(9.035092f,21.0399f,9.818163f,21.252228f,10.552696f,21.056583f)
                curveTo(11.2872305f,20.860939f,11.860938f,20.28723f,12.056583f,19.552696f)
                curveTo(12.252228f,18.818163f,12.0399f,18.035093f,11.5f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,4.0f)
                lineTo(11.0f,4.0f)
            }
}

public val LucideIcons.All.HandshakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Handshake: ImageVector
    @Composable get() = HandshakeDefinition.asImageVector()
