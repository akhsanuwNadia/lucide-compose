package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,15.0f)
                lineTo(11.5f,20.5f)
                lineTo(9.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.516f,16.07f)
                curveTo(2.7876756f,14.503384f,1.4397008f,11.309032f,2.2208915f,8.261447f)
                curveTo(3.002082f,5.213861f,5.7204947f,3.061851f,8.866019f,3.0008843f)
                curveTo(12.011543f,2.9399176f,14.811303f,4.984974f,15.71f,8.0f)
                lineTo(17.5f,8.0f)
                curveTo(19.233473f,8.000059f,20.812788f,8.99581f,21.560144f,10.559901f)
                curveTo(22.3075f,12.123993f,22.090006f,13.978299f,21.001f,15.327f)
            }
}

public val LucideIcons.All.CloudCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudCheck: ImageVector
    @Composable get() = CloudCheckDefinition.asImageVector()
