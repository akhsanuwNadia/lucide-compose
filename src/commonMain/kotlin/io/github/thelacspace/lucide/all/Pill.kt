package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pill") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5,20.5)
                lineTo(20.5,10.5)
                curveTo(21.771562576293945,9.253860473632812,22.275962829589844,7.4208550453186035,21.820959091186523,5.699604034423828)
                curveTo(21.365955352783203,3.9783530235290527,20.02164649963379,2.6340444087982178,18.300395965576172,2.1790404319763184)
                curveTo(16.579145431518555,1.7240363359451294,14.746139526367188,2.228437662124634,13.5,3.5)
                lineTo(3.5,13.5)
                curveTo(2.228437662124634,14.746139526367188,1.7240363359451294,16.579145431518555,2.1790404319763184,18.300395965576172)
                curveTo(2.6340444087982178,20.02164649963379,3.9783530235290527,21.365955352783203,5.699604034423828,21.820959091186523)
                curveTo(7.4208550453186035,22.275962829589844,9.253860473632812,21.771562576293945,10.5,20.5)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,8.5)
                lineTo(15.5,15.5)
            }
}

public val LucideIcons.All.PillDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pill: ImageVector
    @Composable get() = PillDefinition.asImageVector()
