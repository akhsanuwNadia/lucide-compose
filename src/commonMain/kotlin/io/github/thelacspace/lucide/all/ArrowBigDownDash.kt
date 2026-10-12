package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigDownDash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                curveTo(14.552285f,8.0f,15.0f,8.447715f,15.0f,9.0f)
                lineTo(15.0f,11.0f)
                curveTo(15.0f,11.552285f,15.447715f,12.0f,16.0f,12.0f)
                lineTo(19.293f,12.0f)
                curveTo(19.579f,11.999939f,19.836868f,12.1721945f,19.946325f,12.436422f)
                curveTo(20.05578f,12.70065f,19.995264f,13.004797f,19.793f,13.207f)
                lineTo(12.853999f,20.146f)
                curveTo(12.627601f,20.372677f,12.320372f,20.500044f,11.999999f,20.500044f)
                curveTo(11.679626f,20.500044f,11.372397f,20.372677f,11.145999f,20.146f)
                lineTo(4.205999f,13.205999f)
                curveTo(4.0044484f,13.003703f,3.9443843f,12.70002f,4.0537505f,12.43623f)
                curveTo(4.1631165f,12.172439f,4.420436f,12.000341f,4.705999f,11.999999f)
                lineTo(8.0f,11.999999f)
                curveTo(8.552285f,11.999999f,9.0f,11.552284f,9.0f,10.999999f)
                lineTo(9.0f,9.0f)
                curveTo(9.0f,8.447715f,9.447715f,8.0f,10.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,4.0f)
                lineTo(15.0f,4.0f)
            }
}

public val LucideIcons.All.ArrowBigDownDashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigDownDash: ImageVector
    @Composable get() = ArrowBigDownDashDefinition.asImageVector()
