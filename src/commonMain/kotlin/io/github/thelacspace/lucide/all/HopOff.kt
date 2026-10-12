package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HopOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.82f,16.12f)
                curveTo(12.51f,16.720001f,14.73f,16.910002f,16.0f,16.970001f)
                curveTo(16.28f,16.980001f,16.53f,16.880001f,16.7f,16.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.14f,20.57f)
                curveTo(11.66f,20.81f,13.58f,21.69f,15.22f,21.94f)
                curveTo(15.68f,22.0f,16.08f,21.69f,16.12f,21.230001f)
                curveTo(16.240002f,19.710001f,15.820001f,17.800001f,15.620001f,16.95f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.13f,21.05f)
                curveTo(17.779999f,21.679998f,19.81f,21.89f,21.0f,21.96f)
                curveTo(21.259975f,21.978786f,21.515326f,21.883942f,21.7f,21.699999f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.99f,5.52f)
                curveTo(19.234041f,6.874372f,20.29325f,8.387526f,21.14f,10.02f)
                curveTo(21.249191f,10.259866f,21.233238f,10.538122f,21.09735f,10.763937f)
                curveTo(20.96146f,10.989752f,20.723072f,11.134151f,20.46f,11.150001f)
                curveTo(19.289999f,11.250001f,17.96f,11.170001f,16.56f,10.900001f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.57f,11.14f)
                curveTo(20.81f,11.66f,21.69f,13.58f,21.94f,15.22f)
                curveTo(21.980001f,15.52f,21.86f,15.81f,21.630001f,15.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f,4.93f)
                curveTo(1.2988313f,8.561916f,1.0092278f,14.353987f,4.2599998f,18.33f)
                curveTo(4.6099997f,18.76f,5.22f,18.73f,5.43f,18.21f)
                curveTo(6.12f,16.5f,6.5f,13.139999f,6.5f,11.499999f)
                curveTo(7.84f,11.949999f,9.6f,12.399999f,11.38f,12.119999f)
                curveTo(11.561719f,12.093932f,11.730115f,12.009734f,11.86f,11.879999f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.52f,17.99f)
                curveTo(6.5699997f,18.94f,8.43f,20.41f,10.02f,21.14f)
                curveTo(10.259866f,21.249191f,10.538122f,21.233238f,10.763937f,21.09735f)
                curveTo(10.989752f,20.96146f,11.134151f,20.723072f,11.150001f,20.46f)
                curveTo(11.35f,18.119999f,10.820001f,15.159999f,9.580001f,12.179999f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.35f,2.68f)
                curveTo(11.717669f,1.3636552f,15.5336275f,1.9677851f,18.33f,4.26f)
                curveTo(18.76f,4.61f,18.73f,5.2200003f,18.21f,5.4300003f)
                curveTo(16.71f,6.03f,13.909999f,6.4100003f,12.139999f,6.4800005f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.HopOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HopOff: ImageVector
    @Composable get() = HopOffDefinition.asImageVector()
