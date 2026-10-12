package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WebhookOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(12.0,17.0)
                curveTo(10.90999984741211,16.979999542236328,10.059999465942383,17.920000076293945,9.5,18.899999618530273)
                curveTo(8.806807518005371,20.14474105834961,7.500590801239014,20.923442840576172,6.075957298278809,20.94124412536621)
                curveTo(4.651323318481445,20.95904541015625,3.3260576725006104,20.213224411010742,2.6019794940948486,18.98619270324707)
                curveTo(1.8779016733169556,17.759159088134766,1.8657019138336182,16.23849105834961,2.569999933242798,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,3.4000000953674316)
                curveTo(9.852409362792969,2.4117391109466553,11.133337020874023,1.9014657735824585,12.431792259216309,2.0329043865203857)
                curveTo(13.730246543884277,2.1643431186676025,14.88293170928955,2.9209635257720947,15.520000457763672,4.059999942779541)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,17.0)
                lineTo(9.100000381469727,11.199999809265137)
                curveTo(9.411298751831055,10.556262969970703,9.432046890258789,9.810039520263672,9.157000541687012,9.149999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(20.299999237060547,20.299999237060547)
                curveTo(19.623252868652344,20.763662338256836,18.820308685302734,21.008037567138672,18.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.600000381469727,13.0)
                curveTo(20.35173988342285,13.268674850463867,21.717853546142578,14.65798568725586,21.957000732421875,16.413999557495117)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.600000381469727,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.WebhookOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WebhookOff: ImageVector
    @Composable get() = WebhookOffDefinition.asImageVector()
