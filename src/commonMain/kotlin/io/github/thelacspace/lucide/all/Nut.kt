package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Nut") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.847f,5.847f)
                lineTo(20.0f,9.0f)
                curveTo(21.913717f,11.001562f,22.516043f,13.920376f,21.551f,16.515999f)
                curveTo(21.241f,17.352f,21.0f,17.932f,21.0f,19.0f)
                lineTo(21.0f,20.0f)
                curveTo(21.0f,20.552284f,20.552284f,21.0f,20.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(17.931f,21.0f,17.352f,21.242f,16.515f,21.552f)
                curveTo(13.920629f,22.52302f,10.999252f,21.919537f,9.002f,20.0f)
                lineTo(5.847f,16.847f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.21f,5.43f)
                curveTo(16.5f,6.12f,13.139999f,6.5f,11.499999f,6.5f)
                curveTo(11.959999f,7.88f,12.409999f,9.24f,12.109999f,11.38f)
                curveTo(12.053908f,11.759382f,11.758583f,12.058753f,11.379999f,12.12f)
                curveTo(9.599999f,12.4f,7.839999f,11.95f,6.499999f,11.5f)
                curveTo(6.499999f,13.14f,6.119999f,16.5f,5.429999f,18.21f)
                curveTo(5.219999f,18.73f,4.6099987f,18.759998f,4.259999f,18.33f)
                curveTo(1.0155386f,14.353391f,1.3081689f,8.566259f,4.9372144f,4.9372144f)
                curveTo(8.56626f,1.3081694f,14.353392f,1.0155395f,18.33f,4.26f)
                curveTo(18.76f,4.61f,18.73f,5.2300005f,18.21f,5.4300003f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f,4.93f)
                lineTo(3.0f,3.0f)
                curveTo(2.8656228f,2.8683376f,2.789898f,2.6881282f,2.789898f,2.5f)
                curveTo(2.789898f,2.3118718f,2.8656228f,2.1316624f,3.0f,2.0f)
            }
}

public val LucideIcons.All.NutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Nut: ImageVector
    @Composable get() = NutDefinition.asImageVector()
