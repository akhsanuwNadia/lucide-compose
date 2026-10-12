package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                curveTo(22.0f,18.10457f,21.10457f,19.0f,20.0f,19.0f)
                lineTo(6.828f,19.0f)
                curveTo(6.2976103f,19.000113f,5.7889853f,19.210901f,5.414f,19.586f)
                lineTo(3.2120001f,21.788f)
                curveTo(3.008943f,21.99102f,2.7035916f,22.051746f,2.4383068f,21.941868f)
                curveTo(2.173022f,21.83199f,2.0000367f,21.57314f,2.0f,21.286f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,9.5f)
                curveTo(7.5f,10.187f,7.765f,10.883f,8.1970005f,11.344f)
                lineTo(11.206f,14.608f)
                curveTo(11.315991f,14.742288f,11.455196f,14.849685f,11.613f,14.922f)
                curveTo(11.863693f,15.027153f,12.146394f,15.025709f,12.396f,14.918f)
                curveTo(12.550153f,14.845686f,12.686149f,14.739759f,12.794f,14.608f)
                lineTo(15.802f,11.344f)
                curveTo(16.252956f,10.835746f,16.501371f,10.179471f,16.5f,9.5f)
                curveTo(16.5f,8.423924f,15.811425f,7.468577f,14.790569f,7.1282916f)
                curveTo(13.769714f,6.788007f,12.645645f,7.139139f,12.0f,8.0f)
                curveTo(11.354355f,7.139139f,10.230286f,6.788007f,9.209431f,7.1282916f)
                curveTo(8.188575f,7.468577f,7.5f,8.423924f,7.5f,9.5f)
            }
}

public val LucideIcons.All.MessageSquareHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareHeart: ImageVector
    @Composable get() = MessageSquareHeartDefinition.asImageVector()
