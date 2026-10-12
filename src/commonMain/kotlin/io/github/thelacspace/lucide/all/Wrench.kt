package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wrench") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.7f,6.3f)
                curveTo(14.318857f,6.6888437f,14.318857f,7.3111567f,14.7f,7.7000003f)
                lineTo(16.3f,9.3f)
                curveTo(16.688843f,9.681143f,17.311155f,9.681143f,17.699999f,9.3f)
                lineTo(20.806f,6.195f)
                curveTo(21.126f,5.873f,21.669f,5.9750004f,21.789f,6.413f)
                curveTo(22.405785f,8.656273f,21.67015f,11.053896f,19.901384f,12.565239f)
                curveTo(18.132618f,14.076583f,15.6495905f,14.429182f,13.53f,13.47f)
                lineTo(5.62f,21.380001f)
                curveTo(4.790499f,22.201841f,3.4527347f,22.198627f,2.627193f,21.37281f)
                curveTo(1.8016515f,20.546993f,1.7988831f,19.209229f,2.6209998f,18.380001f)
                lineTo(10.531f,10.470001f)
                curveTo(9.571818f,8.35041f,9.9244175f,5.8673825f,11.435761f,4.0986156f)
                curveTo(12.947105f,2.329849f,15.344728f,1.5942165f,17.588001f,2.2110014f)
                curveTo(18.026001f,2.3310013f,18.128002f,2.8730013f,17.807001f,3.1950014f)
                close()
            }
}

public val LucideIcons.All.WrenchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wrench: ImageVector
    @Composable get() = WrenchDefinition.asImageVector()
