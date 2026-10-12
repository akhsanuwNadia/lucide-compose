package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WrenchOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.747f,5.093f)
                curveTo(12.088079f,2.667703f,14.915732f,1.4764594f,17.588f,2.211f)
                curveTo(18.026f,2.3309999f,18.128f,2.873f,17.807f,3.195f)
                lineTo(14.7f,6.3f)
                curveTo(14.318857f,6.6888437f,14.318857f,7.3111567f,14.7f,7.7000003f)
                lineTo(16.3f,9.3f)
                curveTo(16.688843f,9.681143f,17.311155f,9.681143f,17.699999f,9.3f)
                lineTo(20.806f,6.195f)
                curveTo(21.126f,5.873f,21.669f,5.9750004f,21.789f,6.413f)
                curveTo(22.524057f,9.085579f,21.33274f,11.913818f,18.907f,13.255f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f,13.5f)
                lineTo(5.62f,21.380001f)
                curveTo(4.790499f,22.201841f,3.4527347f,22.198627f,2.627193f,21.37281f)
                curveTo(1.8016515f,20.546993f,1.7988831f,19.209229f,2.6209998f,18.380001f)
                lineTo(10.500999f,10.500001f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.WrenchOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WrenchOff: ImageVector
    @Composable get() = WrenchOffDefinition.asImageVector()
