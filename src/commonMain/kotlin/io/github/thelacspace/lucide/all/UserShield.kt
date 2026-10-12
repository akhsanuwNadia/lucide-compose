package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserShield") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(6.0f,15.0f)
                curveTo(3.790861f,15.0f,2.0f,16.790861f,2.0f,19.0f)
                lineTo(2.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.5f)
                curveTo(22.0f,19.999f,20.25f,21.249f,18.17f,21.973999f)
                curveTo(18.06108f,22.010908f,17.94277f,22.009142f,17.835001f,21.969f)
                curveTo(15.750001f,21.249f,14.000001f,19.999f,14.000001f,17.499f)
                lineTo(14.000001f,14.0f)
                curveTo(14.000553f,13.724248f,14.224249f,13.500999f,14.500001f,13.501f)
                curveTo(15.500001f,13.501f,16.75f,12.901f,17.62f,12.141001f)
                curveTo(17.840803f,11.959813f,18.158722f,11.959394f,18.380001f,12.14f)
                curveTo(19.255001f,12.905001f,20.5f,13.5f,21.5f,13.5f)
                curveTo(21.776142f,13.5f,22.0f,13.723858f,22.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,7.0f)
                curveTo(4.99359f,8.433324f,5.7545805f,9.760521f,6.994818f,10.479039f)
                curveTo(8.235056f,11.197558f,9.764944f,11.197558f,11.005181f,10.479039f)
                curveTo(12.2454195f,9.760521f,13.00641f,8.433324f,13.0f,7.0f)
                curveTo(13.00641f,5.566676f,12.2454195f,4.239479f,11.005181f,3.5209603f)
                curveTo(9.764944f,2.8024418f,8.235056f,2.8024418f,6.994818f,3.5209603f)
                curveTo(5.7545805f,4.239479f,4.99359f,5.566676f,5.0f,7.0f)
            }
}

public val LucideIcons.All.UserShieldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserShield: ImageVector
    @Composable get() = UserShieldDefinition.asImageVector()
