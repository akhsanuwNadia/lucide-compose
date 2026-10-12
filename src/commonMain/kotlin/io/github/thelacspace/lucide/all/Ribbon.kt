package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ribbon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,11.22f)
                curveTo(11.0f,9.997f,10.0f,9.0f,10.0f,8.0f)
                curveTo(10.004924f,6.898922f,10.8989105f,6.0089245f,12.0f,6.0089245f)
                curveTo(13.1010895f,6.0089245f,13.995076f,6.898922f,14.0f,8.0f)
                curveTo(14.0f,9.0f,13.002f,10.002f,11.99f,11.22f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(14.57f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.243f,9.016f)
                curveTo(7.5492287f,7.127936f,9.698275f,6.0004277f,11.9941435f,5.9986324f)
                curveTo(14.290012f,5.9968367f,16.440819f,7.1209817f,17.75f,9.007f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.35f,14.53f)
                lineTo(12.0f,11.22f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.35f,14.53f)
                curveTo(7.728f,12.246f,6.0f,10.221f,6.0f,7.0f)
                curveTo(6.0147724f,4.2473044f,8.6967325f,2.0223107f,12.0f,2.0223107f)
                curveTo(15.3032675f,2.0223107f,17.985228f,4.2473044f,18.0f,7.0f)
                curveTo(17.995f,10.22f,16.222f,12.235001f,14.57f,14.5f)
                lineTo(18.126999f,19.027f)
                curveTo(18.29546f,19.241428f,18.369047f,19.515348f,18.330723f,19.78533f)
                curveTo(18.292397f,20.05531f,18.145481f,20.297928f,17.924f,20.457f)
                lineTo(16.029999f,21.817001f)
                curveTo(15.587124f,22.134314f,14.971738f,22.038715f,14.645999f,21.602001f)
                lineTo(12.0f,18.0f)
                lineTo(9.321f,21.593f)
                curveTo(8.994252f,22.032795f,8.374448f,22.127771f,7.931f,21.806f)
                lineTo(6.066f,20.453f)
                curveTo(5.846908f,20.294003f,5.7016377f,20.052973f,5.6633806f,19.784985f)
                curveTo(5.6251235f,19.516998f,5.697149f,19.244947f,5.863f,19.030998f)
                close()
            }
}

public val LucideIcons.All.RibbonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ribbon: ImageVector
    @Composable get() = RibbonDefinition.asImageVector()
