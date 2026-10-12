package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ghost") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                lineTo(15.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.528f,20.472f)
                curveTo(7.8286185f,20.167557f,8.238647f,19.996197f,8.6665f,19.996197f)
                curveTo(9.094353f,19.996197f,9.504381f,20.167557f,9.805f,20.472f)
                lineTo(10.862f,21.528f)
                curveTo(11.162581f,21.832134f,11.572395f,22.003298f,12.0f,22.003298f)
                curveTo(12.427606f,22.003298f,12.8374195f,21.832134f,13.1380005f,21.528f)
                lineTo(14.195001f,20.472f)
                curveTo(14.49562f,20.167557f,14.905648f,19.996197f,15.3335f,19.996197f)
                curveTo(15.761353f,19.996197f,16.171381f,20.167557f,16.472f,20.472f)
                lineTo(17.586f,21.586f)
                curveTo(17.98507f,22.005585f,18.601267f,22.13619f,19.136238f,21.91458f)
                curveTo(19.671211f,21.692966f,20.014544f,21.164875f,20.0f,20.586f)
                lineTo(20.0f,10.0f)
                curveTo(19.980303f,5.5956874f,16.404356f,2.0356972f,12.0f,2.0356972f)
                curveTo(7.595643f,2.0356972f,4.0196967f,5.5956874f,4.0f,10.0f)
                lineTo(4.0f,20.586f)
                curveTo(3.9854555f,21.164875f,4.3287888f,21.692966f,4.863761f,21.91458f)
                curveTo(5.398733f,22.136192f,6.014932f,22.005587f,6.414f,21.586f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                lineTo(9.0f,11.0f)
            }
}

public val LucideIcons.All.GhostDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ghost: ImageVector
    @Composable get() = GhostDefinition.asImageVector()
