package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayingCardsFan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.65f,7.65f)
                curveTo(12.859766f,7.1625357f,13.254668f,6.7784243f,13.747756f,6.5822396f)
                curveTo(14.240843f,6.3860545f,14.791686f,6.3938828f,15.278999f,6.604f)
                lineTo(20.789f,8.978001f)
                curveTo(21.276213f,9.187774f,21.660135f,9.582507f,21.8563f,10.075357f)
                curveTo(22.052465f,10.568208f,22.044804f,11.1188f,21.835f,11.606001f)
                lineTo(17.877998f,20.79f)
                curveTo(17.668224f,21.277214f,17.27349f,21.661137f,16.780642f,21.857302f)
                curveTo(16.28779f,22.053467f,15.737199f,22.045805f,15.249998f,21.836f)
                lineTo(9.739998f,19.462f)
                curveTo(9.252784f,19.252226f,8.868862f,18.857492f,8.672697f,18.364643f)
                curveTo(8.476533f,17.871792f,8.484195f,17.321201f,8.693998f,16.834f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,7.777f)
                lineTo(18.0f,4.0f)
                curveTo(18.0f,2.8954306f,17.10457f,2.0f,16.0f,2.0f)
                lineTo(10.0f,2.0f)
                curveTo(8.895431f,2.0f,8.0f,2.8954306f,8.0f,4.0f)
                lineTo(8.0f,14.0f)
                curveTo(7.9997015f,14.770443f,8.441974f,15.472554f,9.137f,15.805f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,4.389f)
                lineTo(3.6360002f,5.198f)
                curveTo(2.5503993f,5.399326f,1.8333117f,6.4422812f,2.0340002f,7.528f)
                lineTo(3.8560002f,17.361f)
                curveTo(4.0573106f,18.447067f,5.100933f,19.164305f,6.1870003f,18.963f)
                lineTo(8.729f,18.493f)
            }
}

public val LucideIcons.All.PlayingCardsFanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayingCardsFan: ImageVector
    @Composable get() = PlayingCardsFanDefinition.asImageVector()
