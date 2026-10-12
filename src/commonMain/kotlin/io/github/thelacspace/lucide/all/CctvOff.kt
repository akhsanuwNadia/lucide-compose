package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CctvOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.309f,6.652f)
                lineTo(17.105999f,9.0529995f)
                curveTo(17.599525f,9.300057f,17.799585f,9.900236f,17.553f,10.393999f)
                lineTo(17.052f,11.3949995f)
                lineTo(17.657f,12.0f)
                lineTo(20.382f,12.0f)
                curveTo(20.72844f,12.000185f,21.050104f,12.179668f,21.232195f,12.474395f)
                curveTo(21.414286f,12.769121f,21.430859f,13.137098f,21.276f,13.4470005f)
                lineTo(20.551998f,14.895f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.166f,15.166f)
                lineTo(14.4470005f,16.605f)
                curveTo(14.328355f,16.842274f,14.120292f,17.022678f,13.868603f,17.106514f)
                curveTo(13.616914f,17.190348f,13.342228f,17.170738f,13.1050005f,17.052f)
                lineTo(3.61f,12.3f)
                curveTo(2.1741815f,11.576775f,1.5930711f,9.828973f,2.31f,8.39f)
                lineTo(3.69f,5.6f)
                curveTo(3.8949924f,5.190221f,4.1941648f,4.834847f,4.563f,4.5629997f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,19.0f)
                lineTo(5.76f,19.0f)
                curveTo(6.520314f,19.005291f,7.2178693f,18.579008f,7.5600004f,17.9f)
                lineTo(9.001f,14.997999f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(2.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,9.0f)
                lineTo(7.01f,9.0f)
            }
}

public val LucideIcons.All.CctvOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CctvOff: ImageVector
    @Composable get() = CctvOffDefinition.asImageVector()
