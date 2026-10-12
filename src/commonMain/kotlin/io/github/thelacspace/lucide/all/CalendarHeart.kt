package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.127f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,10.125f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.62f,17.8f)
                curveTo(14.046977f,17.20257f,13.848292f,16.338741f,14.102717f,15.550995f)
                curveTo(14.357142f,14.763249f,15.02358f,14.178835f,15.837804f,14.029458f)
                curveTo(16.652029f,13.88008f,17.482515f,14.189869f,18.0f,14.836f)
                curveTo(18.519878f,14.196741f,19.347599f,13.892783f,20.157635f,14.043669f)
                curveTo(20.96767f,14.194553f,21.630442f,14.776144f,21.88529f,15.5597105f)
                curveTo(22.140139f,16.343279f,21.946299f,17.203474f,21.380001f,17.802f)
                lineTo(18.754002f,20.658f)
                curveTo(18.564451f,20.876255f,18.289577f,21.001598f,18.000502f,21.001598f)
                curveTo(17.711426f,21.001598f,17.436552f,20.876255f,17.247002f,20.658f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,5.0f)
            }
}

public val LucideIcons.All.CalendarHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarHeart: ImageVector
    @Composable get() = CalendarHeartDefinition.asImageVector()
