package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.62f,18.8f)
                curveTo(3.0469775f,18.20257f,2.848292f,17.338741f,3.102717f,16.550995f)
                curveTo(3.357142f,15.763249f,4.0235796f,15.178835f,4.8378043f,15.029458f)
                curveTo(5.6520286f,14.88008f,6.4825163f,15.189869f,7.0f,15.836f)
                curveTo(7.5198765f,15.196737f,8.347599f,14.8927765f,9.157638f,15.043661f)
                curveTo(9.967676f,15.194545f,10.630448f,15.776137f,10.885297f,16.559708f)
                curveTo(11.140145f,17.343277f,10.946301f,18.203474f,10.38f,18.802f)
                lineTo(7.754f,21.658f)
                curveTo(7.564095f,21.87565f,7.2893524f,22.000553f,7.0005f,22.000553f)
                curveTo(6.711648f,22.000553f,6.4369054f,21.87565f,6.247f,21.658f)
                close()
            }
}

public val LucideIcons.All.FileHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileHeart: ImageVector
    @Composable get() = FileHeartDefinition.asImageVector()
